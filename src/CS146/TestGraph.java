package CS146;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.swingViewer.View;
import org.graphstream.ui.swingViewer.Viewer;
import org.graphstream.ui.swingViewer.ViewerPipe;

public class TestGraph 
{
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                MyFrame frame = new MyFrame();
                JFrame.setDefaultLookAndFeelDecorated(true);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    public static class MyFrame extends JFrame implements ActionListener
    {
    	private JLabel text;
        private static final long serialVersionUID = 8394236698316485656L;
        private Viewer viewer = new Viewer(gs, Viewer.ThreadingModel.GRAPH_IN_SWING_THREAD);
        private View view = viewer.addDefaultView(false);
        private String[] algo = { "BellMan", "Dijkstra"};
        protected boolean loop = true;
        protected ViewerPipe fromViewer = viewer.newViewerPipe();
    	private static org.graphstream.graph.Graph gs = new MultiGraph("SJSU map");
    	private static CS146.Graph SJSU;
    	private String N1;
    	private String N2;
    	
        public MyFrame() {
        	setTitle("CS146 final project");
        	GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        	this.setMaximizedBounds(env.getMaximumWindowBounds());
        	this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
            gs.addAttribute("ui.stylesheet", "url(file:///../stylesheet)");
            
            ArrayList<Node> nodeList = new ArrayList<Node>();
            
            Node NPG = new Node("North garage at Tenth Street", 37.338886, -121.880801);
    		Node WPG = new Node("West garage at Fourth Street", 37.332410, -121.882997);
    		Node SPG = new Node("South garage at Seventh Street", 37.333126, -121.880851);
    		Node A = new Node("Modular A", 37.334628, -121.879800);
    		Node ADM = new Node("Administration", 37.336820, -121.882825);
    		Node AQX = new Node("Aquatics Center", 37.334875, -121.879103);
    		Node ART = new Node("Art Building", 37.336042, -121.879741);
    		Node ASH = new Node("Associated Students House", 37.333358, -121.882676);
    		Node ASP = new Node("ASP", 37.334490, -121.879891);
    		Node B  = new Node("Modular B", 37.334740, -121.879790);
    		Node BBC = new Node("Boccardo Business Complex", 37.336511, -121.878979);
    		Node BB = new Node("Building BB", 37.335081, -121.878707);
    		Node BK = new Node("Bookstore", 37.336797, -121.880122);
    		Node BT = new Node("Business Tower", 37.337010, -121.878995);
    		Node CAR = new Node("Career Center", 37.336924, -121.883073);
    		Node CC = new Node("Computer Center", 37.335952, -121.883288);
    		Node CCB = new Node("Central Classroom Building", 37.335670, -121.881882);
    		Node CL = new Node("Clark Hall", 37.336216, -121.882526);
    		Node CH = new Node("Concert Hall", 37.335484, -121.880610);
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
    		Node HB = new Node("Health Bldg", 37.335723, -121.879146);
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
    		Node UT = new Node("University Theatre", 37.336136, -121.884821);
    		Node WSH = new Node("Washburn Hall", 37.333633, -121.879341);
    		Node WSQ = new Node("Washington Square Hall", 37.334170, -121.884244);
    		Node YUH = new Node("Yoshihiro Uchida Hall", 37.333599, -121.883890);
    		
    		NPG.addEdge(CYA);
    		CYA.addEdge(CYB);
    		NPG.addEdge(SSC);
    		SSC.addEdge(CYA);
    		CYA.addEdge(IS);;
    		CYB.addEdge(IS);
    		CYB.addEdge(BK);
    		CYB.addEdge(BT);
    		BT.addEdge(BBC);
    		BBC.addEdge(CP);
    		BBC.addEdge(ART);
    		CP.addEdge(ART);
    		CP.addEdge(HB);
    		HB.addEdge(EC);
    		HB.addEdge(ART);
    		ART.addEdge(BK);
    		ART.addEdge(MUS);
    		ART.addEdge(EC);
    		BK.addEdge(SU);
    		IS.addEdge(ENG);
    		ENG.addEdge(SU);
    		ENG.addEdge(MUS);
    		ENG.addEdge(CAR);
    		ENG.addEdge(ADM);
    		ENG.addEdge(CL);
    		ENG.addEdge(CCB);
    		SU.addEdge(CCB);
    		SU.addEdge(MUS);
    		MUS.addEdge(CH);
    		CAR.addEdge(ADM);
    		ADM.addEdge(CL);
    		CL.addEdge(CCB);
    		CCB.addEdge(SHCC);
    		SHCC.addEdge(SPXE);
    		SHCC.addEdge(DBH);
    		CCB.addEdge(DBH);
    		CCB.addEdge(EC);
    		DBH.addEdge(FOB);
    		FOB.addEdge(SPXE);
    		SPXE.addEdge(SPXC);
    		SPXC.addEdge(FOB);
    		SPXC.addEdge(YUH);
    		SPXC.addEdge(SPM);
    		SPM.addEdge(YUH);
    		WSQ.addEdge(YUH);
    		SPM.addEdge(WSQ);
    		FOB.addEdge(SPM);
    		DBH.addEdge(MD);
    		WSQ.addEdge(SCI);
    		SCI.addEdge(KING);
    		KING.addEdge(HGH);
    		KING.addEdge(UT);
    		UT.addEdge(HGH);
    		UT.addEdge(DMH);
    		HGH.addEdge(DMH);
    		HGH.addEdge(IRC);
    		UT.addEdge(IRC);
    		DMH.addEdge(IRC);
    		DMH.addEdge(CAR);
    		DMH.addEdge(ADM);
    		IRC.addEdge(ADM);
    		IRC.addEdge(CAR);
    		IRC.addEdge(CC);
    		KING.addEdge(TH);
    		KING.addEdge(MD);
    		TH.addEdge(MD);
    		TH.addEdge(SCI);
    		TH.addEdge(WSQ);
    		CC.addEdge(CL);
    		CC.addEdge(TH);
    		CC.addEdge(MD);
    		CL.addEdge(MD);
    		CL.addEdge(TH);
    		HGH.addEdge(SCI);
    		HGH.addEdge(WSQ);
    		HGH.addEdge(SPM);
    		HGH.addEdge(TH);
    		HGH.addEdge(MD);
    		IRC.addEdge(TH);
    		IRC.addEdge(MD);
    		MD.addEdge(CCB);
    		CC.addEdge(CCB);
    		CC.addEdge(DBH);
    		CC.addEdge(KING);
    		CC.addEdge(HGH);
    		CC.addEdge(ADM);
    		CC.addEdge(CAR);
    		CC.addEdge(SCI);
    		WSQ.addEdge(FOB);
    		FOB.addEdge(MD);
    		MD.addEdge(WSQ);
    		YUH.addEdge(WPG);
    		WPG.addEdge(ASH);
    		WPG.addEdge(DH);
    		DH.addEdge(MQH);
    		ASH.addEdge(MQH);
    		ASH.addEdge(YUH);
    		ASH.addEdge(SPXC);
    		ASH.addEdge(SPXE);
    		ASH.addEdge(DH);
    		SPXE.addEdge(MQH);
    		SPXE.addEdge(MQH);
    		MQH.addEdge(SPG);
    		DH.addEdge(SPG);
    		SPG.addEdge(SH);
    		SPXE.addEdge(SH);
    		MQH.addEdge(SPG);
    		MQH.addEdge(SHCC);
    		SH.addEdge(SHCC);
    		SPG.addEdge(SPXE);
    		SPG.addEdge(UPD);
    		SH.addEdge(UPD);
    		UPD.addEdge(WSH);
    		WSH.addEdge(RYC);
    		RYC.addEdge(HOV);
    		SH.addEdge(HOV);
    		SH.addEdge(RYC);
    		RYC.addEdge(UPD);
    		WSH.addEdge(SH);
    		HOV.addEdge(UPD);
    		HOV.addEdge(A);
    		HOV.addEdge(B);
    		EC.addEdge(HOV);
    		EC.addEdge(SH);
    		EC.addEdge(A);
    		EC.addEdge(B);
    		AQX.addEdge(A);
    		AQX.addEdge(B);
    		AQX.addEdge(HOV);
    		AQX.addEdge(DC);
    		RYC.addEdge(DC);
    		WSH.addEdge(DC);
    		DC.addEdge(HOV);
    		ASP.addEdge(A);
    		ASP.addEdge(B);
    		ASP.addEdge(HOV);
    		ASP.addEdge(AQX);
    		AQX.addEdge(BB);
    		DC.addEdge(JWH);
    		BB.addEdge(JWH);
    		AQX.addEdge(EC);
    		HB.addEdge(BB);
    		HB.addEdge(AQX);
    		HB.addEdge(CVC);
    		BB.addEdge(CVC);
    		CP.addEdge(CVC);
    		JWH.addEdge(CVA);
    		CVC.addEdge(CVA);
    		CVA.addEdge(CVB);
    		CVC.addEdge(CVB);
    		CH.addEdge(EC);
    		EC.addEdge(SHCC);
    		SH.addEdge(MQH);
    		MUS.addEdge(SHCC);
    		MUS.addEdge(CCB);
    		
    		SJSU = new CS146.Graph();
    		
    		nodeList.addAll(Arrays.asList(NPG, WPG, SPG, A, ADM, AQX, ART, ASH, ASP, B, BBC, BB, BK, BT, CAR, CC, CCB, CL, CH, CP, CVA, CVB, CVC, CYA, CYB, DC, DMH, DH, DBH, ENG, EC, HB, FOB, HOV, HGH, IS, IRC, JWH, KING, MQH, MD, MUS, RYC, SCI, SPXC, SPXE, SPM, SHCC, SSC, SU, SH, TH, UPD, UT, WSH, WSQ, YUH));
    		
    		for(Node N: nodeList){
    			SJSU.addVertice(N);
    		}
    		
            for(Node N: SJSU.getVertice()){
            	gs.addNode(N.getLocationName());
            	gs.getNode(N.getLocationName()).setAttribute("xyz", N.getLongitude(),N.getLatitude());
            	gs.getNode(N.getLocationName()).setAttribute("ui.label", gs.getNode(N.getLocationName()).getId());
            }
            
            for(Node N: SJSU.getVertice()){
            	for(Entry<Node, Double> asd:N.getEdges().entrySet()){
            		gs.addEdge(N.getLocationName()+asd.getKey().getLocationName(), N.getLocationName(), asd.getKey().getLocationName());
            	}
            }
            
            setLayout(new BorderLayout());
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

            add(topPanel, BorderLayout.NORTH);
            add(view, BorderLayout.CENTER);
            add(bottomPanel, BorderLayout.SOUTH);
            
    		String[] array = new String[nodeList.size()];
    		for(int i = 0; i < array.length; i++) {
    		    array[i] = nodeList.get(i).getLocationName();
    		}
    		
    		JComboBox<String> jBox1 = new JComboBox<>(array);
    		JComboBox<String> jBox2 = new JComboBox<>(array);
            JComboBox<String> algoList = new JComboBox<>(algo);
            
            algoList.setSelectedIndex(0);
            jBox1.setSelectedIndex(0);
            jBox2.setSelectedIndex(0);

            text = new JLabel("Directions");
            JButton button1 = new JButton("Get Path");
            JButton button2 = new JButton("Reset");
            
            algoList.addActionListener(this);
            jBox1.addActionListener(this);
            jBox2.addActionListener(this);
            button1.addActionListener(this);
            button2.addActionListener(this);
            
            topPanel.add(jBox1);
            topPanel.add(jBox2);
            topPanel.add(algoList);
            topPanel.add(button1);
            topPanel.add(button2);
            bottomPanel.add(text);

            algoList.setActionCommand("Algo");
            jBox1.setActionCommand("Node1");
            jBox2.setActionCommand("Node2");
            button1.setActionCommand("Get Path");
            button2.setActionCommand("Reset");
            
            N1 = array[0];
            N2 = array[0];
            
            List<Node> l = SJSU.shortestpath(NPG, MUS);
            for(int i=0;i<l.size();i++){
                System.out.println(l.get(i).getLocationName());
            } 
            
        }

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Node1")){
				JComboBox cb = (JComboBox)e.getSource();
		        String stuff = (String)cb.getSelectedItem();
				text.setText(stuff);
				N1 = stuff;
			}
			else if(e.getActionCommand().equals("Node2")){
				JComboBox cb = (JComboBox)e.getSource();
		        String stuff = (String)cb.getSelectedItem();
				text.setText(stuff);
				N2 = stuff;
			}
			else if(e.getActionCommand().equals("Algo")){
				JComboBox cb = (JComboBox)e.getSource();
		        String stuff = (String)cb.getSelectedItem();
				text.setText(stuff);
			}
			else if(e.getActionCommand().equals("Get Path")){
				text.setText("Directions > will > go > here");
				//SJSU.getPathBellmanFord(N1, N2);
				gs.getNode(N1).setAttribute("ui.class", "marked");
				if(!N1.equals(N2)){
					gs.getNode(N2).setAttribute("ui.class", "marked");
					gs.getEdge(N1+N2).setAttribute("ui.class", "path");
				}
			}
			else if(e.getActionCommand().equals("Reset")){
				text.setText("reset");
				gs.getNode(N1).removeAttribute("ui.class");
				if(!N1.equals(N2)){
					gs.getNode(N2).removeAttribute("ui.class");
					gs.getEdge(N1+N2).removeAttribute("ui.class");
				}
			}
		}
    }
}