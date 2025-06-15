package datiDiGioco;

public class DatiDiGioco {

	public static class protocol1 {

		private Byte protocol;
		private Short id;
		private Byte level;
		private Byte playerClass;

		public protocol1(Short id,Byte level,Byte playerClass) {
			this.protocol = 1;
			this.id = id;
			this.level = level;
			this.playerClass = playerClass;
		}
		
		public Short getId() {
			return id;
		}

		public Byte getLevel() {
			return level;
		}

		public Byte getPlayerClass() {
			return playerClass;
		}

	}

}
