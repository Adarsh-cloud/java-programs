package com.capgemin.bean;

public class Transaction implements Comparable<Transaction> {
	private int transId;
	private double transAmount;
	private String transType;
	private String transDescription;
	private static int transCount = 100;
	private long timeInMiliSeconds;

	public Transaction() {
		super();

		transId = Transaction.transCount++;
		transAmount = 0;
		transType = null;
		transDescription = null;

	}

	public Transaction(double transAmount, String transType, String transDescription) {
		super();

		this.transAmount = transAmount;
		this.transType = transType;
		this.transDescription = transDescription;
	}

	public long getTimeInMiliSeconds() {
		return timeInMiliSeconds;
	}

	public void setTimeInMiliSeconds(long timeInMiliSeconds) {
		this.timeInMiliSeconds = System.currentTimeMillis();
	}

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransDescription() {
		return transDescription;
	}

	public void setTransDescription(String transDescription) {
		this.transDescription = transDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(transAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transDescription == null) ? 0 : transDescription.hashCode());
		result = prime * result + transId;
		result = prime * result + ((transType == null) ? 0 : transType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (Double.doubleToLongBits(transAmount) != Double.doubleToLongBits(other.transAmount))
			return false;
		if (transDescription == null) {
			if (other.transDescription != null)
				return false;
		} else if (!transDescription.equals(other.transDescription))
			return false;
		if (transId != other.transId)
			return false;
		if (transType == null) {
			if (other.transType != null)
				return false;
		} else if (!transType.equals(other.transType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction Id=" + getTransId() + ", Transaction Amount=" + getTransAmount() + ", Transaction Type="
				+ getTransType() + ", Transaction Description=" + getTransDescription() + ", Transaction Time"
				+ getTimeInMiliSeconds();
	}

	@Override
	public int compareTo(Transaction o) {
		if (this.getTimeInMiliSeconds() < o.getTimeInMiliSeconds())
			return -1;
		else if (this.getTimeInMiliSeconds() > o.getTimeInMiliSeconds())
			return 1;
		return 0;
	}

}
