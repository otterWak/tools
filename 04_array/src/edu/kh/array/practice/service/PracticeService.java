package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		int[] arr = new int[9];
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			arr[i] = i+1;
			
			if(i%2 == 0) {
				sum += arr[i];
			}
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : "+ sum);
	}
//	길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//	[실행 화면]
//	1 2 3 4 5 6 7 8 9
//	짝수 번째 인덱스 합 : 20

	
	public void practice2(){
		int[] arr = new int[9];
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			
			if(i%2 == 1) {
				sum += arr[i];
			}
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : "+ sum);
	}
//	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//	[실행 화면]
//	9 8 7 6 5 4 3 2 1
//	홀수 번째 인덱스 합 : 25

	
	public void practice3(){
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		// --> int input = new int[sc.nextInt];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			
			System.out.print(arr[i]+ " ");
		}
	}
//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//	[실행 화면]
//	양의 정수 : 5
//	1 2 3 4 5



	public void practice4(){
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("입력"+ i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int check = sc.nextInt();
		
		boolean bl = false;
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == check) {
				System.out.println("인덱스 : "+ i);
				bl = true;
				break;
			}
		}
		
		if(!bl) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}
//	정수 5개를 입력 받아 배열을 초기화 하고
//	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
//
//	[실행 화면 1]
//	입력 0 : 5
//	입력 1 : 8
//	입력 2 : 9
//	입력 3 : 10
//	입력 4 : 4
//	검색할 값 : 8
//	인덱스 : 1
//
//	[실행 화면 2]
//	입력 0 : 5
//	입력 1 : 8
//	입력 2 : 9
//	입력 3 : 10
//	입력 4 : 4
//	검색할 값 : 1
//	일치하는 값이 존재하지 않습니다.



	public void practice5(){
		// 1. 사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		// 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char 배열에 넣기
		//	  먼저 사용자가 입력한 문자열(str)의 길이만큼의 char 배열을 할당
		char[] ch = new char[input.length()];
		
		// 반복문을 통해 str.charAt(i) 값을 arr[i]에 담는 과정
		for(int i = 0; i < ch.length; i++) {
			ch[i] = input.charAt(i);
		}
		
		// 3. 문자 입력받기 (검색할 문자)
		System.out.print("문자 : ");
		char check = sc.next().charAt(0);
		
		// 4. 검색할 문자가 문자열에 몇개가 들어와있는지, 어느 인덱스에 있는지 파악
		int count = 0; // 검색할 문자가 몇개 들어있는지 세어줄 변수
		// 문자열에서 동일한 문자가 발견될 때 마다 1씩 증가
		String add = "";
		
		for(int i = 0 ; i < ch.length; i++) {
			if(ch[i] == check) {
				add += i+ " ";
				count++;
			}
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n", input, check, add);
		System.out.println(check + "개수 : " + count);
	}
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//	[실행 화면]
//	문자열 : application
//	문자 : i
//	application에 i가 존재하는 위치(인덱스) : 4 8
//	i 개수 : 2

	
	public void practice6(){
		// 1. 사용자에게 값을 입력받고 그 값만큼 배열 길이 할당
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		// 2. 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스 값을 초기화하기
		int sum = 0;
		String print = ""; 
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열"+ i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			print += arr[i] + " ";
		}
		
		System.out.println(print);
		System.out.println("총합 : " + sum);
	}
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//
//	[실행 화면]
//	정수 : 5
//	배열 0번째 인덱스에 넣을 값 : 4
//	배열 1번째 인덱스에 넣을 값 : -4
//	배열 2번째 인덱스에 넣을 값 : 3
//	배열 3번째 인덱스에 넣을 값 : -3
//	배열 4번째 인덱스에 넣을 값 : 2
//	4 -4 3 -3 2
//	총 합 : 2

	
	public void practice7(){
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] num = new char[input.length()];
		
		for(int i=0; i<num.length; i++) {
			num[i] = input.charAt(i);
			
			if(i<=7) {
				System.out.print(num[i]);
			}else {
				System.out.print("*");
			}
		}
		
	}
//	주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
//
//	[실행 화면]
//	주민등록번호(-포함) : 123456-1234567
//	123456-1******
	
	
	public void practice8(){
		boolean flag = false;
		
		do {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input < 3 || input%2 == 0) {
				System.out.println("다시 입력하세요.");
			}else {
				// 입력받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];
				
				int num = 0; // arr 배열에 대입될 값
				
				for(int i=0; i<arr.length; i++) {
					if(i<=arr.length/2) {
						arr[i] = ++num;
					}else {
						arr[i] = --num;
					}
					
					// 각 요소에 대입된 값 출력하기
					// 출력 시, 추가 (단, 마지막 제외)
					
					if(i == arr.length -1) { // 마지막 바퀴
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
					}
					
				}
				flag = true;
			}
			
		}while(!flag);
		
		
	}
//	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요.
//
//	[실행 화면]
//	정수 : 4
//	다시 입력하세요.
//	정수 : -6
//	다시 입력하세요.
//	정수 : 5
//	1, 2, 3, 2, 1
//	
	
	
	public void practice9(){
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
	}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//
//	[실행 화면]
//	발생한 난수 : 9 7 6 2 5 10 7 2 9 6
	
	
	public void practice10(){
		int[] arr = new int[10];
		String print = "";
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			print += arr[i] + " ";
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("발생한 난수 : " + print);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//	[실행 화면]
//	발생한 난수 : 5 3 2 7 4 8 6 10 9 10
//	최대값 : 10
//	최소값 : 2
	
	
	public void practice11(){
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*10+1);
			
			arr[i] = random;
			
			// 중복 제거 for 문
			for(int x = 0; x<i; x++) {
				if(arr[x] == arr[i]) { // 앞쪽 요소에 대입된 값을 현재 요소에 대입된 값과 비교
					i--;
					break;
				}
			}
		}
		
		// 3. 출력
		for(int i= 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//
//	[실행 화면]
//	4 1 3 6 9 5 8 10 7 2
	
	
	public void practice12(){
int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*40+1);
			
			arr[i] = random;
			
			for(int x = 0; x<i; x++) {
				if(arr[x] == random) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
//	로또 번호 자동 생성기 프로그램을 만들기.
//	(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
//
//	[실행 화면]
//	3 4 15 17 28 40
	
	
	public void practice13(){
		// 1. 사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 3. char 배열에서 중복 값 존재할 경우 출력 X
		int count = 0;// 문자개수 카운트
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0 ; i < arr.length; i++) {
			
			boolean flag = true; // 중복 체크용 flag
			
			// for 문
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // 중복 발생했을 때
					break;
				}
			}
			
			if(flag) { // 중복이 발생하지 않았을 경우
				// if 문
				if(i == 0) {
					System.out.print(arr[i]);
				}else {
					System.out.print(", "+ arr[i]);
				}
				// 중복 아닐 때만 count 갯수 늘리기
				count++ ;
			}
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
		
		
//		System.out.print("문자열 : ");
//		String input = sc.nextLine();
//		
//		//문자열에 있는 문자
//		char[] ch = new char[input.length()];
//		int re = 0;
//		String print = "";
//		
//		for(int i=0; i<ch.length; i++) {
//
//			ch[i] = input.charAt(i);
//			print += ch[i];
//			
//			for(int x = 0; x < i; x ++) {
//				if(ch[i] == ch[x]) {
//					re++;
//					break;
//				}
//				
//			}
//			
//			
//			
//		}
//		
//		System.out.println("문자열에 있는 문자 : " + print);
//		System.out.print("문자 개수 : " + (input.length()-re));
	}
//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//	문자의 개수와 함께 출력하세요.
//
//	[실행 화면]
//	문자열 : application
//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
//	문자 개수 : 8
	
	
	public void practice14(){
		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 일렵받기
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복이 시작되는 구간부터 무한반복하는 while 작성하여 내부에 종료조건 만들어서 break
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// 4. 값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') { // 값을 더 입력하겠다
				// 5. 더 입력받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) { // 인덱스의 크기가 기존배열보다 작을 경우
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사
					}else { // 인덱스 크기가 기존 배열보다 클 경우 새로운 입력 받기
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
					
				}
				
				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
				arr = newArr;
				
				
				
			}else if(ch=='n' || ch == 'N') { // 값을 더 입력하지 않겠다
				break; // while 반복문 종료
				
			}else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
		// 10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		int input = sc.nextInt();
//		
//		String[] arr = new String[input];
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(i+ "번째 문자열 : ");
//		}
//		
//		
//		boolean reA = false;
//		
//		do{
//			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
//			char reQ = sc.next().charAt(0);
//			
//			if(reQ == 'y') reA = true;
//			else if(reQ == 'x') {reA = false; break;}
//			else System.out.println(" y 또는 n을 입력하시오");
//			
//			
//			System.out.print("더 입력하고 싶은 개수 : ");
//			int add = sc.nextInt();
//			
//			String[] arrRe = new String[input + add];
//			
//			for(int i=0; i<arrRe.length; i++) {
//				if(i<=input) {
//					arrRe[i] = arr[i];
//				}
//			}
//			
//		}while(reA);
	}
//	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
//	
//	[실행 화면]
//	배열의 크기를 입력하세요 : 3
//	1번째 문자열 : 자바의 정석
//	2번째 문자열 : 알고리즘
//	3번째 문자열 : C프로그래밍
//	더 값을 입력하시겠습니까?(Y/N) : y
//	더 입력하고 싶은 개수 : 2
//	4번째 문자열 : 인간관계
//	5번째 문자열 : 자기계발
//	더 값을 입력하시겠습니까?(Y/N) : y
//	더 입력하고 싶은 개수 : 1
//	6번째 문자열 : 영단어600
//	더 값을 입력하시겠습니까?(Y/N) : n
//	[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
}