package builder;

public interface Process {
	public String doAnalyze();
	public String doDocument();
	public String doCode();
	public String doDeploye();
	public String doTest();
	public String doBugFix();
	public String doRelease();
}
