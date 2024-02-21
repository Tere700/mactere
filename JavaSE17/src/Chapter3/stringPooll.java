package Chapter3;

public class stringPooll {

	public static void main(String[] args) {
		String html = 
				"""
				<!DOCTYPE html>
				<html lang = "zh-tw">
				<head>
					<title>%s</title>
				</head>
				<body>
				%s
				</html>
				""";
		String title = "Java tutorial";
		String content = "<b>Hello, World</b>";
		System.out.println(html.formatted(title,content));
	}

}
