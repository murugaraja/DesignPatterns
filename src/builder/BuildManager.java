package builder;

public class BuildManager {
	
	Process process = null;
	
	public void init(Process process) {
		this.process = process;
		process.doAnalyze();
		process.doDocument();
		process.doCode();
	}

	public void test(){
		process.doTest();
		process.doBugFix();
		process.doRelease();
	}
}
