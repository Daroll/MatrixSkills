package window;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Skills1 { 
	

    //Creating array containing numbers  
    String[] shapes ={"0","1","2","3","4","5"};  



	private JFrame frame;
	private JButton btnCancel, btnNext, btnPrevious;
	
	//run
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Skills1 window = new Skills1();
						window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();}
				}
		});
	}

	public Skills1(){
	initialize(); 
}

//frame initialization 

	private void initialize() {
	frame = new JFrame("Skills Matrix");
	frame.setSize(1300,700);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.getContentPane().setLayout(null); 


	//textfields with labels (I'm gonna change them into comboboxes in the future)
	// Test Approach skills:
	
	JLabel TestApproach = new JLabel ("Test Approach");
	TestApproach.setForeground(Color.decode("#6699ff"));
	TestApproach.setBounds(20, 10, 150, 20);
	frame.getContentPane().add(TestApproach);

	JLabel regressionTesting = new JLabel("Regression testing");
	regressionTesting.setBounds(50, 40, 150, 20);
	frame.getContentPane().add(regressionTesting);
	
	JComboBox regressionTestingCB = new JComboBox();
	regressionTestingCB.setBounds(210, 40, 50, 20);
	frame.getContentPane().add(regressionTestingCB);
	
	JLabel exploratoryTesting = new JLabel ("Exploratory testing");
	exploratoryTesting.setBounds(50, 70, 150, 20);
	frame.getContentPane().add(exploratoryTesting);
	
	JComboBox exploaratoryTestingCB = new JComboBox ();
	exploaratoryTestingCB.setBounds(210, 70, 50, 20);
	frame.getContentPane().add(exploaratoryTestingCB);
	
	JLabel testingTours = new JLabel ("Testing tours");
	testingTours.setBounds(50, 100, 150, 20);
	frame.getContentPane().add(testingTours);
	
	JComboBox testingToursCB = new JComboBox ();
	testingToursCB.setBounds(210, 100, 50, 20);
	frame.getContentPane().add(testingToursCB);
	
	JLabel benchmarking = new JLabel ("Benchmarking");
	benchmarking.setBounds(50, 130, 150, 20);
	frame.getContentPane().add(benchmarking);
	
	JComboBox benchmarkingCB = new JComboBox ();
	benchmarkingCB.setBounds(210, 130, 50, 20);
	frame.getContentPane().add(benchmarkingCB);
	
	JLabel determineTestApproach = new JLabel ("Determine test approach");
	determineTestApproach.setBounds(50, 160, 150, 20);
	frame.getContentPane().add(determineTestApproach);
	
	JComboBox determineTestApproachCB = new JComboBox ();
	determineTestApproachCB.setBounds(210, 160, 50, 20);
	frame.getContentPane().add(determineTestApproachCB);
	
	JLabel BDD = new JLabel ("BDD");
	BDD.setBounds(50, 190, 150, 20);
	frame.getContentPane().add(BDD);
	
	JComboBox BDDCB = new JComboBox ();
	BDDCB.setBounds(210, 190, 50, 20);
	frame.getContentPane().add(BDDCB);
	
	JLabel TDD = new JLabel ("TDD");
	TDD.setBounds(50, 220, 150, 20);
	frame.getContentPane().add(TDD);
	
	JComboBox TDDCB = new JComboBox ();
	TDDCB.setBounds(210, 220, 50, 20);
	frame.getContentPane().add(TDDCB);
	
	// Test Design Skills:
	
	JLabel TestDesignSkills = new JLabel ("Test Design Skills");
	TestDesignSkills.setForeground(Color.decode("#6699ff"));
	TestDesignSkills.setBounds(20, 270, 150, 20);
	frame.getContentPane().add(TestDesignSkills);
	
	JLabel BlackBoxTechniques = new JLabel("Black box techniques");
	BlackBoxTechniques.setBounds(50, 300, 150, 20);
	frame.getContentPane().add(BlackBoxTechniques);
	
	JComboBox BlackBoxTechniquesCB = new JComboBox();
	BlackBoxTechniquesCB.setBounds(210, 300, 50, 20);
	frame.getContentPane().add(BlackBoxTechniquesCB);

	JLabel WhiteBoxTechniques = new JLabel("White box techniques");
	WhiteBoxTechniques.setBounds(50, 330, 150, 20);
	frame.getContentPane().add(WhiteBoxTechniques);
	
	JComboBox WhiteBoxTechniquesCB = new JComboBox();
	WhiteBoxTechniquesCB.setBounds(210, 330, 50, 20);
	frame.getContentPane().add(WhiteBoxTechniquesCB);
	
	JLabel Chartering = new JLabel("Chartering");
	Chartering.setBounds(50, 360, 150, 20);
	frame.getContentPane().add(Chartering);
	
	JComboBox CharteringCB = new JComboBox();
	CharteringCB.setBounds(210, 360, 50, 20);
	frame.getContentPane().add(CharteringCB);
	
	JLabel TestTechniqueSelection = new JLabel("Test technique selection");
	TestTechniqueSelection.setBounds(50, 390, 150, 20);
	frame.getContentPane().add(TestTechniqueSelection);
	
	JComboBox TestTechniqueSelectionCB = new JComboBox();
	TestTechniqueSelectionCB.setBounds(210, 390, 50, 20);
	frame.getContentPane().add(TestTechniqueSelectionCB);
	
	JLabel RequirementsAnalysis = new JLabel("Requirements analysis");
	RequirementsAnalysis.setBounds(50, 420, 150, 20);
	frame.getContentPane().add(RequirementsAnalysis);
	
	JComboBox RequirementsAnalysisCB = new JComboBox();
	RequirementsAnalysisCB.setBounds(210, 420, 50, 20);
	frame.getContentPane().add(RequirementsAnalysisCB);
	
	JLabel IdentifyingUsingOracles = new JLabel("Identifying/using oracles");
	IdentifyingUsingOracles.setBounds(50, 450, 150, 20);
	frame.getContentPane().add(IdentifyingUsingOracles);
	
	JComboBox IdentifyingUsingOraclesCB = new JComboBox();
	IdentifyingUsingOraclesCB.setBounds(210, 450, 50, 20);
	frame.getContentPane().add(IdentifyingUsingOraclesCB);
	
	JLabel IdentifyingCombinationalExplosions = new JLabel("Identifying combinational explosions");
	IdentifyingCombinationalExplosions.setBounds(50, 480, 150, 20);
	frame.getContentPane().add(IdentifyingCombinationalExplosions);
	
	JComboBox IdentifyingCombinationalExplosionsCB = new JComboBox();
	IdentifyingCombinationalExplosionsCB.setBounds(210, 480, 50, 20);
	frame.getContentPane().add(IdentifyingCombinationalExplosionsCB);
	
	JLabel SelectingHeuristics = new JLabel("Selecting Heuristics");
	SelectingHeuristics.setBounds(50, 510, 150, 20);
	frame.getContentPane().add(SelectingHeuristics);
	
	JComboBox SelectingHeuristicsCB = new JComboBox();
	SelectingHeuristicsCB.setBounds(210, 510, 50, 20);
	frame.getContentPane().add(SelectingHeuristicsCB);
	
	// Testing Tools:
	
	JLabel TestingTools = new JLabel ("Testing Tools");
	TestingTools.setForeground(Color.decode("#6699ff"));
	TestingTools.setBounds(400, 10, 150, 20);
	frame.getContentPane().add(TestingTools);
	
	JLabel TestLink = new JLabel("Test Link");
	TestLink.setBounds(430, 40, 150, 20);
	frame.getContentPane().add(TestLink);
	
	JComboBox TestLinkCB = new JComboBox();
	TestLinkCB.setBounds(590, 40, 50, 20);
	frame.getContentPane().add(TestLinkCB);
	
	JLabel ApacheJMeter = new JLabel("Apache JMeter");
	ApacheJMeter.setBounds(430, 70, 150, 20);
	frame.getContentPane().add(ApacheJMeter);
	
	JComboBox ApacheJMeterCB = new JComboBox();
	ApacheJMeterCB.setBounds(590, 70, 50, 20);
	frame.getContentPane().add(ApacheJMeterCB);
	
	JLabel JIRA = new JLabel("JIRA");
	JIRA.setBounds(430, 100, 150, 20);
	frame.getContentPane().add(JIRA);
	
	JComboBox JIRACB = new JComboBox();
	JIRACB.setBounds(590, 100, 50, 20);
	frame.getContentPane().add(JIRACB);
	
	JLabel Bugzilla = new JLabel("Bugzilla");
	Bugzilla.setBounds(430, 130, 150, 20);
	frame.getContentPane().add(Bugzilla);
	
	JComboBox BugzillaCB = new JComboBox();
	BugzillaCB.setBounds(590, 130, 50, 20);
	frame.getContentPane().add(BugzillaCB);
	
	JLabel SeleniumSoapUI = new JLabel("Selenium, SoapUI");
	SeleniumSoapUI.setBounds(430, 160, 150, 20);
	frame.getContentPane().add(SeleniumSoapUI);
	
	JComboBox SeleniumSoapUICB = new JComboBox();
	SeleniumSoapUICB.setBounds(590, 160, 50, 20);
	frame.getContentPane().add(SeleniumSoapUICB);
	
	JLabel JMeterLoadUIWAST = new JLabel("JMeter, LoadUI, WAST");
	JMeterLoadUIWAST.setBounds(430, 190, 150, 20);
	frame.getContentPane().add(JMeterLoadUIWAST);
	
	JComboBox JMeterLoadUIWASTCB = new JComboBox();
	JMeterLoadUIWASTCB.setBounds(590, 190, 50, 20);
	frame.getContentPane().add(JMeterLoadUIWASTCB);
	
	JLabel RobotiumCalabashAppium = new JLabel("Robotium, Calabash, Appium");
	RobotiumCalabashAppium.setBounds(430, 220, 150, 20);
	frame.getContentPane().add(RobotiumCalabashAppium);
	
	JComboBox RobotiumCalabashAppiumCB = new JComboBox();
	RobotiumCalabashAppiumCB.setBounds(590, 220, 50, 20);
	frame.getContentPane().add(RobotiumCalabashAppiumCB);
	
	JLabel HPQualityCenterHPUFT = new JLabel("HP Quality Center i HP UFT");
	HPQualityCenterHPUFT.setBounds(430, 250, 150, 20);
	frame.getContentPane().add(HPQualityCenterHPUFT);
	
	JComboBox HPQualityCenterHPUFTCB = new JComboBox();
	HPQualityCenterHPUFTCB.setBounds(590, 250, 50, 20);
	frame.getContentPane().add(HPQualityCenterHPUFTCB);
	
	// Programming Languages:
	
	JLabel ProgrammingLanguages = new JLabel ("Programming Languages");
	ProgrammingLanguages.setForeground(Color.decode("#6699ff"));
	ProgrammingLanguages.setBounds(400, 300, 150, 20);
	frame.getContentPane().add(ProgrammingLanguages);
	
	JLabel Java = new JLabel("Java");
	Java.setBounds(430, 330, 150, 20);
	frame.getContentPane().add(Java);
	
	JComboBox JavaCB = new JComboBox();
	JavaCB.setBounds(590, 330, 50, 20);
	frame.getContentPane().add(JavaCB);
	
	JLabel CLanguages = new JLabel("C, C++, C#");
	CLanguages.setBounds(430, 360, 150, 20);
	frame.getContentPane().add(CLanguages);
	
	JComboBox CLanguagesCB = new JComboBox();
	CLanguagesCB.setBounds(590, 360, 50, 20);
	frame.getContentPane().add(CLanguagesCB);
	
	JLabel VBLanguages = new JLabel("VB, VBA, VB Script");
	VBLanguages.setBounds(430, 390, 150, 20);
	frame.getContentPane().add(VBLanguages);
	
	JComboBox VBLanguagesCB = new JComboBox();
	VBLanguagesCB.setBounds(590, 390, 50, 20);
	frame.getContentPane().add(VBLanguagesCB);
	
	JLabel SQL = new JLabel("SQL");
	SQL.setBounds(430, 420, 150, 20);
	frame.getContentPane().add(SQL);
	
	JComboBox SQLCB = new JComboBox();
	SQLCB.setBounds(590, 420, 50, 20);
	frame.getContentPane().add(SQLCB);
	
	JLabel XMLXSL = new JLabel("XML, XSL");
	XMLXSL.setBounds(430, 450, 150, 20);
	frame.getContentPane().add(XMLXSL);
	
	JComboBox XMLXSLCB = new JComboBox();
	XMLXSLCB.setBounds(590, 450, 50, 20);
	frame.getContentPane().add(XMLXSLCB);
	
	JLabel HTMLCSS = new JLabel("HTML, CSS");
	HTMLCSS.setBounds(430, 480, 150, 20);
	frame.getContentPane().add(HTMLCSS);
	
	JComboBox HTMLCSSCB = new JComboBox();
	HTMLCSSCB.setBounds(590, 480, 50, 20);
	frame.getContentPane().add(HTMLCSSCB);
	
	
	// Operation Systems:
	
	JLabel OperationSystems = new JLabel ("Operation Systems");
	OperationSystems.setForeground(Color.decode("#6699ff"));
	OperationSystems.setBounds(780, 10, 150, 20);
	frame.getContentPane().add(OperationSystems);

	JLabel WindowsOS = new JLabel("Windows OS");
	WindowsOS.setBounds(810, 40, 150, 20);
	frame.getContentPane().add(WindowsOS);
	
	JComboBox WindowsOSCB = new JComboBox();
	WindowsOSCB.setBounds(970, 40, 50, 20);
	frame.getContentPane().add(WindowsOSCB);

	JLabel Linux = new JLabel("Linux: Fedora, Ubuntu, Redhat, Debian");
	Linux.setBounds(810, 70, 150, 20);
	frame.getContentPane().add(Linux);
	
	JComboBox LinuxCB = new JComboBox();
	LinuxCB.setBounds(970, 70, 50, 20);
	frame.getContentPane().add(LinuxCB);

	JLabel MacOS = new JLabel("MacOS");
	MacOS.setBounds(810, 100, 150, 20);
	frame.getContentPane().add(MacOS);
	
	JComboBox MacOSCB = new JComboBox();
	MacOSCB.setBounds(970, 100, 50, 20);
	frame.getContentPane().add(MacOSCB);
	
	JLabel iOS = new JLabel("iOS");
	iOS.setBounds(810, 130, 150, 20);
	frame.getContentPane().add(iOS);
	
	JComboBox iOSCB = new JComboBox();
	iOSCB.setBounds(970, 130, 50, 20);
	frame.getContentPane().add(iOSCB);
	
	JLabel Android = new JLabel("Android");
	Android.setBounds(810, 160, 150, 20);
	frame.getContentPane().add(Android);
	
	JComboBox AndroidCB = new JComboBox();
	AndroidCB.setBounds(970, 160, 50, 20);
	frame.getContentPane().add(AndroidCB);
	
	JLabel CentOS = new JLabel("CentOS");
	CentOS.setBounds(810, 190, 150, 20);
	frame.getContentPane().add(CentOS);
	
	JComboBox CentOSCB = new JComboBox();
	CentOSCB.setBounds(970, 190, 50, 20);
	frame.getContentPane().add(CentOSCB);
	
	JLabel Symbian = new JLabel("Symbian");
	Symbian.setBounds(810, 220, 150, 20);
	frame.getContentPane().add(Symbian);
	
	JComboBox SymbianCB = new JComboBox();
	SymbianCB.setBounds(970, 220, 50, 20);
	frame.getContentPane().add(SymbianCB);

	JLabel WindowsPhone = new JLabel("Windows Phone");
	WindowsPhone.setBounds(810, 250, 150, 20);
	frame.getContentPane().add(WindowsPhone);
	
	JComboBox WindowsPhoneCB = new JComboBox();
	WindowsPhoneCB.setBounds(970, 250, 50, 20);
	frame.getContentPane().add(WindowsPhoneCB);
	
	JLabel Unix = new JLabel("Unix");
	Unix.setBounds(810, 280, 150, 20);
	frame.getContentPane().add(Unix);
	
	JComboBox UnixCB = new JComboBox();
	UnixCB.setBounds(970, 280, 50, 20);
	frame.getContentPane().add(UnixCB);
	
	JLabel RealTimeSystems = new JLabel("Real-Time Systems");
	RealTimeSystems.setBounds(810, 310, 150, 20);
	frame.getContentPane().add(RealTimeSystems);
	
	JComboBox RealTimeSystemsCB = new JComboBox();
	RealTimeSystemsCB.setBounds(970, 310, 50, 20);
	frame.getContentPane().add(RealTimeSystemsCB);
	
	// Languages:
	
	JLabel Languages = new JLabel ("Languages");
	Languages.setForeground(Color.decode("#6699ff"));
	Languages.setBounds(780, 360, 150, 20);
	frame.getContentPane().add(Languages);
	
	JLabel English = new JLabel("English");
	English.setBounds(810, 390, 150, 20);
	frame.getContentPane().add(English);
	
	JComboBox EnglishCB = new JComboBox();
	EnglishCB.setBounds(970, 390, 50, 20);
	frame.getContentPane().add(EnglishCB);

	JLabel German = new JLabel("German");
	German.setBounds(810, 420, 150, 20);
	frame.getContentPane().add(German);
	
	JComboBox GermanCB = new JComboBox();
	GermanCB.setBounds(970, 420, 50, 20);
	frame.getContentPane().add(GermanCB);
	
	JLabel French = new JLabel("French");
	French.setBounds(810, 450, 150, 20);
	frame.getContentPane().add(French);
	
	JComboBox FrenchCB = new JComboBox();
	FrenchCB.setBounds(970, 450, 50, 20);
	frame.getContentPane().add(FrenchCB);
	
	JLabel Spanish = new JLabel("Spanish");
	Spanish.setBounds(810, 480, 150, 20);
	frame.getContentPane().add(Spanish);
	
	JComboBox SpanishCB = new JComboBox();
	SpanishCB.setBounds(970, 480, 50, 20);
	frame.getContentPane().add(SpanishCB);
	
	JLabel Russian = new JLabel("Russian");
	Russian.setBounds(810, 510, 150, 20);
	frame.getContentPane().add(Russian);
	
	JComboBox RussianCB = new JComboBox();
	RussianCB.setBounds(970, 510, 50, 20);
	frame.getContentPane().add(RussianCB);
	
	
	// buttons next (>>), previous (<<) and cancel
	
	btnNext = new JButton(">>");
	btnNext.setBounds(1200, 600, 70, 50);
	frame.getContentPane().add(btnNext);
	
	btnPrevious = new JButton("<<");
	btnPrevious.setBounds(1100, 600, 70, 50);
	frame.getContentPane().add(btnPrevious);
	
	btnCancel = new JButton("Cancel");
	btnCancel.setBounds(20, 600, 90, 50);
	frame.getContentPane().add(btnCancel);
	}
}