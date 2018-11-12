
public class MainController {
	private Room[] room;
	
	public MainController()
	{
		room = new Room[10];
		
	}
	public boolean addRoom(Room r)
	{
		int i;
		if ( room[9] != null )
			return false;
		for ( i = 0; (i < 10) && (room[i] != null); i++)
		{
			
		}


		room[i] = r;
		return true;
	}
	public int turnOffAllSmartDevices() {
		int i, j, nr = 0;
		if ( room[0] == null )
			return -1;
		for ( i = 0; (i < 10) && (room[i] != null); i++)
		{
			SmartDevice[] device= room[i].getSmartDevices();
			for ( j = 0; (j < 5) && (device[j] != null); j++)
			{
				if (device[j].isTurnedOn())
				{
					device[j].turnOff();
					nr++;
				}
			}
		}
		return nr;
	}
	public int turnOnAllSmartDevices() {
		int i, j, nr = 0;
		if ( room[0] == null )
			return -1;
		for ( i = 0; (i < 10) && (room[i] != null); i++)
		{
			SmartDevice[] device= room[i].getSmartDevices();
			for ( j = 0; (j < 5) && (device[j] != null); j++)
			{
				if (device[j].isTurnedOn() == false)
				{
					device[j].turnOn();
					nr++;
				}
			}
		}
		return nr;
	}
	public String getStatus()
	{	
		String s = new String();
		s += ("Controller controlls: \n");
		for ( int i = 0; (i < 10) && (room[i] != null); i++)
		{	
			s += ("		");
			s += room[i].getStatus();
		}
		return s;
	} 
}
