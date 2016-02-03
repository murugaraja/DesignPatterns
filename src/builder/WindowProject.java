package builder;

public class WindowProject implements Process {

	public String doAnalyze() {
		System.out.println("WindowProject : doAnalyze");
		return null;
	}

	public String doBugFix() {
		System.out.println("WindowProject : bug");
		return null;
	}

	public String doCode() {
		System.out.println("WindowProject : code");
		return null;
	}

	public String doDeploye() {
		System.out.println("WindowProject : deploy");
		return null;
	}

	public String doDocument() {
		System.out.println("WindowProject : doc");
		return null;
	}

	public String doTest() {
		System.out.println("WindowProject : test");
		return null;
	}

	public String doRelease() {
		System.out.println("WindowProject : release");
		return null;
	}
}