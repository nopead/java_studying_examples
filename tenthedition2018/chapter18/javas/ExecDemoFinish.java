package tenthedition2018.chapter18.classes;

class ExecDemoFinish{
	public static void main(String[] args){
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try{
			p = r.exec("Notepad");
			p.waitFor();
		} catch (Exception e){
			System.out.println("Ошибка запуска Notepad");
		}
		
		System.out.println("Редактор Notepad возвратил: " + p.exitValue());
	}
}