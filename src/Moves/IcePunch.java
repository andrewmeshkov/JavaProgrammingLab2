package Moves;

import ru.ifmo.se.pokemon.*;

public class IcePunch extends PhysicalMove{
		public IcePunch() {
			super(Type.ICE, 75, 100);
		}
		
		@Override
		public String describe() {
			return "deal damage with ice";
		}
}
