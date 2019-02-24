package assignment.streamsandwriters.problem3;

	import java.util.Date;
	
	public class Shipment {
	
		private String shipmnetId;
		private String bookingNumber;
		private Date departureDate;
		private Date arrivalDate;
		private String totalWeight;
	
		public Shipment(String shipmnetId, String bookingNumber, Date departureDate, Date arrivalDate, String totalWeight) {
			this.shipmnetId = shipmnetId;
			this.bookingNumber = bookingNumber;
			this.departureDate = departureDate;
			this.arrivalDate = arrivalDate;
			this.totalWeight = totalWeight;
		}
	
		public String getShipmnetId() {
			return shipmnetId;
		}
	
		public void setShipmnetId(String shipmnetId) {
			this.shipmnetId = shipmnetId;
		}
	
		public String getBookingNumber() {
			return bookingNumber;
		}
	
		public void setBookingNumber(String bookingNumber) {
			this.bookingNumber = bookingNumber;
		}
	
		public Date getDepartureDate() {
			return departureDate;
		}
	
		public void setDepartureDate(Date departureDate) {
			this.departureDate = departureDate;
		}
	
		public Date getArrivalDate() {
			return arrivalDate;
		}
	
		public void setArrivalDate(Date arrivalDate) {
			this.arrivalDate = arrivalDate;
		}
	
		public String getTotalWeight() {
			return totalWeight;
		}
	
		public void setTotalWeight(String totalWeight) {
			this.totalWeight = totalWeight;
		}
	}
