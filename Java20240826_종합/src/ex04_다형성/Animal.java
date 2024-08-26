package ex04_다형성;

class Animal{
		
		private String name;
		
		public Animal() {}
		
		public Animal(String name) {
			this.name = name;
		}
		
		void speak() {
			
		}
		
		String getName() {
			return name;
		}
		
		void setName(String name) {
			this.name = name;
		}
		
		void info() {
			System.out.println(name+ " 입니다.");
		}
	
	}
