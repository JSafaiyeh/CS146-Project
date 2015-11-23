
public class TestGraph {

	//public TestGraph(){

	public static void main(String[] args) {

		Node NPG = new Node("North garage at Tenth Street", 37.338886, -121.880801);
		Node WPG = new Node("West garage at Fourth Street", 37.332410, -121.882997);
		Node SPG = new Node("South garage at Seventh Street", 37.333126, -121.880851);
		Node A = new Node("Modular A", 37.334628, -121.879800);
		Node ADM = new Node("Administration", 37.336820, -121.882825);
		Node AQX = new Node("Aquatics Center", 37.334875, -121.879103);
		Node ART = new Node("Art Building", 37.336042, -121.879741);
		Node ASH = new Node("Associated Students House", 37.333358, -121.882676);
		Node B  = new Node("Modular B", 37.334740, -121.879790);
		Node BBC = new Node("Boccardo Business Complex", 37.336511, -121.878979);
		Node BB = new Node("Building BB", 37.335081, -121.878707);
		Node BK = new Node("Bookstore", 37.336797, -121.880122);
		Node BT = new Node("Business Tower", 37.337010, -121.878995);
		Node CAR = new Node("Career Center", 37.336924, -121.883073);
		Node CC = new Node("Computer Center", 37.335952, -121.883288);
		Node CCB = new Node("Central Classroom Building", 37.335670, -121.881882);
		Node CL = new Node("Clark Hall", 37.336216, -121.882526);
		Node CP = new Node("Cooling Plant", 37.336080, -121.878512);
		Node CVA = new Node("Campus Village A", 37.334416, -121.877387);
		Node CVB = new Node("Campus Village B", 37.334834, -121.876958);
		Node CVC = new Node("Campus Village C", 37.335457, -121.878245);
		Node CYA = new Node("Corporation Yard A", 37.338140, -121.880283);
		Node CYB = new Node("Corporation Yard B", 37.337850, -121.880020);
		Node DC = new Node("Dining Commons", 37.334041, -121.878546);
		Node DMH = new Node("Dudley Moorhead Hall", 37.336540, -121.883910);
		Node DH = new Node("Duncan Hall", 37.332650, -121.881990);
		Node DBH = new Node("Dwight Bentel Hall", 37.335107, -121.882344);
		Node ENG = new Node("Engineering Building", 37.337155, -121.881624);
		Node EC = new Node("Event Center", 37.335064, -121.880423);
		Node FOB = new Node("Faculty Offices", 37.334518, -121.882826);
		Node HOV = new Node("Hoover Hall", 37.334416, -121.879865);
		Node HGH = new Node("Hugh Gillis Hall", 37.335841, -121.884425);
		Node IS = new Node("Industrial Studies", 37.337522, -121.880728);
		Node IRC = new Node("Instructional Resource Center", 37.336207, -121.883631);
		Node JWH = new Node("Joe West Hall", 37.334322, -121.878020);
		Node KING = new Node("Dr. Martin Luther King, Jr. Library", 37.335474, -121.884972);
		Node MQH = new Node("MacQuarrie Hall", 37.333589, -121.881872);
		Node MD = new Node("Morris Dailey Auditorium", 37.335337, -121.883127);
		Node MUS = new Node("Music Building", 37.335603, -121.880864);
		Node RYC = new Node("Royce Hall", 37.334025, -121.879631);
		Node SCI = new Node("Science Building", 37.334708, -121.884748);
		Node SPXC = new Node("Spartan Complex", 37.334008, -121.882624);
		Node SPXE = new Node("Spartan Complex East", 37.334417, -121.881905);
		Node SPM = new Node("Spartan Memorial", 37.334204, -121.883332);
		Node SHCC = new Node("Student Health and Counseling Center", 37.334759, -121.881261);
		Node SSC = new Node("Student Services Center", 37.339297, -121.880897);
		Node SU = new Node("Student Union", 37.336336, -121.881377);
		Node SH = new Node("Sweeney Hall", 37.333931, -121.881036);
		Node TH = new Node("Tower Hall", 37.335313, -121.883472);
		Node UPD = new Node("University Police Department", 37.333437, -121.880199);
		Node WSH = new Node("Washburn Hall", 37.333633, -121.879341);
		Node WSQ = new Node("Washington Square Hall", 37.334170, -121.884244);
		Node YUH = new Node("Yoshihiro Uchida Hall", 37.333599, -121.883890);
		
		NPG.addEdge(CYA);
		CYA.addEdge(NPG);
		CYA.addEdge(CYB);
		CYB.addEdge(CYA);
		NPG.addEdge(SSC);
		SSC.addEdge(NPG);
		SSC.addEdge(CYA);
		CYA.addEdge(SSC);
		
		Graph SJSU = new Graph();
		SJSU.addVertice(NPG);
		SJSU.addVertice(CYA);
		SJSU.addVertice(CYB);
		SJSU.addVertice(SSC);
	}

}
