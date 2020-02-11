import java.text.SimpleDateFormat;
import java.util.Date;

public class timestamp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat formatter = 
			new SimpleDateFormat("EEE,MMM dd, yyyy HH:mm:ss");
			String formattedDate = formatter.format(now);
		System.out.println(formattedDate + \n +"Hello, " + args[0] + "!");
	}

}
