public class MilesToMeters {

	/*
	 *
	 * The sun is 92955807 miles from the earth.
	 * Convert that to the number of meters to the sun; return that value.
	 * It should be stored in the appropriate data type.
	 * Call your method metersToTheSun.
	 *
	 * Note: 1 mile = 1609 meters
	 */

	public static long metersToTheSun(){
		long milesToSun = 92955807L;

		long metersToTheSun = milesToSun * 1609;

		return metersToTheSun;
	}

}
