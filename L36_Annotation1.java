import java.lang.annotation.*;
//Meta Annotation ->annotation to annotation
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//->Where the interface need to be used like->class(Type),method,interface etc
@Retention(RetentionPolicy.RUNTIME)//to specify the lifetime of the annotation
@interface CricketPlayer{
	String name() default "Cricket";
	int runs();
	
}

@CricketPlayer(runs=12500)
class Virat{
	@CricketPlayer(runs = 0)
	private String name;
	private String team;

	public Virat() {
		System.out.println();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@CricketPlayer(runs = 0)
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
}
public class L36_Annotation1 {
@SuppressWarnings({  "rawtypes" })
public static void main(String[] args){
	Virat v = new Virat();
 Class  c=	 v.getClass();
//  Annotation a = c.getAnnotation(L36_Annotation1.class);
//  CricketPlayer cp = (CricketPlayer) a;
//  System.out.println(cp.runs());
  Annotation[] aa = c.getAnnotations();
  for (Annotation annotation : aa) {
	System.out.println(annotation);
}

	
}
}
