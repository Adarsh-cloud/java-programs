public	abstract class Item{
		private int Id, NoC;
		private String title;
		public Item() {
			super();
		}
		public int getId() {
			return Id;
		}
		public int getNoC() {
			return NoC;
		}
		public String getTitle() {
			return title;
		}
		public void setId(int id) {
			Id = id;
		}
		public void setNo(int no) {
			NoC = no;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (Id != other.Id)
				return false;
			if (NoC != other.NoC)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
		public abstract void print ();
		public abstract String checkIn();
		public abstract String checkOut();
		public abstract void addItem();
	}
