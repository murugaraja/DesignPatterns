package builder;

public class WebProject implements Process {

	public String doAnalyze() {
		System.out.println("WebProject : doAnalyze");
		return null;
	}

	public String doBugFix() {
		System.out.println("WebProject : bug");
		return null;
	}

	public String doCode() {
		System.out.println("WebProject : code");
		return null;
	}

	public String doDeploye() {
		System.out.println("WebProject : deploy");
		return null;
	}

	public String doDocument() {
		System.out.println("WebProject : doc");
		return null;
	}

	public String doTest() {
		System.out.println("WebProject : test");
		return null;
	}

	public String doRelease() {
		System.out.println("WebProject : release");
		return null;
	}
}