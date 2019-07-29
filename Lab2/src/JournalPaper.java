import java.util.Scanner;
public class JournalPaper extends WrittenItem {
	private int year;
	Scanner scan = new Scanner(System.in);

	public JournalPaper() {
		super();
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void print() {
		System.out.println("Journal Paper ID:"+getId());
		System.out.println("JournalPaper Title:"+getTitle());
		System.out.println("Journal Paper Year"+getYear());
		System.out.println("Journal Paper Number of copies"+getNoC());
	}

	@Override
	public String checkIn() {
		return "Checked In" ;
	}

	@Override
	public String checkOut() {
		return "Checked Out";
	}

	@Override
	public void addItem() {
		System.out.println("Enter Journal Paper ID:");setId(scan.nextInt());
		System.out.println("Enter JournalPaper Title:");setTitle(scan.next());
		System.out.println("Enter Journal Paper Year");setYear(scan.nextInt());
		System.out.println("Enter Journal Paper Number of copies");setNo(scan.nextInt());
	}

}
