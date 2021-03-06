package com.excep;
//Day14에 했던 예제

public class OperationAuthenticator {
	
	public void inputFormat(String str)  throws MyException {
		
		String temp[] = str.split(","); // 쉼표로 구분해라
		
		if(temp.length != 2) { // 입력한 숫자가 2개가 아니면
			throw new MyException("숫자 입력 오류! : " + str);
		}
		
	}
	
	//굳이 안써도된다.
	@SuppressWarnings("unused") // 사용하지않는 변수에 대해 에러메시지를 표시하지마라(노란줄 보기싫을때)
	public void number(String str) throws MyException {
		
		try {
			
			if(str.indexOf(".") != -1) { // 데이터를 못찾으면 -1이다. 만약 -1이 아니면
				double num = Double.parseDouble(str);
			} else {
				int num = Integer.parseInt(str);
			}
			
		} catch (NumberFormatException e) {
			throw new MyException("숫자 변환 불가 : " + str);
		}
		
	}
	
	
	public void operator(char ch) throws MyException {
		
		switch(ch) {
		
		case '+':
		case '-':
		case '*':
		case '/':
			return;
		default:
			throw new MyException("연산자 오류! : " + ch); // 위에 throws MyException 안쓰면 오류뜸
				
				
		}
				
	}
}