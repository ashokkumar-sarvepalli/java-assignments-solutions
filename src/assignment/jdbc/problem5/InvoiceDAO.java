package assignment.jdbc.problem5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvoiceDAO {

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;

	List<Invoice> findInvoiceByAmount(int amount) throws SQLException {

		List<Invoice> listOfInvoices = new ArrayList<Invoice>();

		try {
			String query = "SELECT * FROM shipment.invoice where total_amount>'" + amount + "'";
			conn = DbConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				Invoice invoice = new Invoice(rs.getInt("id"), rs.getString("customer_name"),
						rs.getInt("payment_attempts"), rs.getDouble("total_amount"), rs.getDouble("balance"),
						rs.getString("status"));
				listOfInvoices.add(invoice);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		for (Invoice invoice : listOfInvoices) {
			System.out.println(invoice.toString());
		}
		return listOfInvoices;
	}

	List<Invoice> findPendingInvoice() throws SQLException {
		List<Invoice> listOfPendingInvoices = new ArrayList<Invoice>();
		try {

			String query = "SELECT * FROM shipment.invoice where status='Pending'";

			conn = DbConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				Invoice invoice = new Invoice(rs.getInt("id"), rs.getString("customer_name"),
						rs.getInt("payment_attempts"), rs.getDouble("total_amount"), rs.getDouble("balance"),
						rs.getString("status"));
				listOfPendingInvoices.add(invoice);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		for (Invoice invoice : listOfPendingInvoices) {
			System.out.println(invoice.toString());
		}
		return listOfPendingInvoices;
	}

	List<Invoice> findNoPaymentInvoice() throws SQLException {

		List<Invoice> ListOfNoPaymentInvoices = new ArrayList<Invoice>();
		try {

			String query = "SELECT * FROM shipment.invoice where payment_attempts=0";

			conn = DbConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(query);
			
			while (rs.next()) {
				Invoice invoice = new Invoice(rs.getInt("id"), rs.getString("customer_name"),
						rs.getInt("payment_attempts"), rs.getDouble("total_amount"), rs.getDouble("balance"),
						rs.getString("status"));
				ListOfNoPaymentInvoices.add(invoice);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		for (Invoice invoice : ListOfNoPaymentInvoices) {
			System.out.println(invoice.toString());
		}
		return ListOfNoPaymentInvoices;
	}

	List<List> invoiceGroupByCustomer() throws SQLException {
		
		List invoiceSummary = new ArrayList<>();
		try {

			String query = "SELECT customer_name, total_amount, balance FROM shipment.invoice group by customer_name;"; 

			conn = DbConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(query);
			
			while (rs.next()) {
				Invoice invoice = new Invoice(0, rs.getString("customer_name"), 0, rs.getDouble("total_amount"), rs.getDouble("balance"), null);
				invoiceSummary.add(invoice);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		for (int i = 0; i < invoiceSummary.size(); i++) {
			Invoice invoice = (Invoice) invoiceSummary.get(i);
			System.out.println(invoice.toString());
		}
		
		return invoiceSummary;
	}

}
