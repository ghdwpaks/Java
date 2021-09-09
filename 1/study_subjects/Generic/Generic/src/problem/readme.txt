problem 패키지에는,문제가 되는 '상황'을 담았다.
지금 코드를 들여다본다면,
main을 사용자 , 클라이언트라고 생각한다면
simplearraylist에 들어가있는 add와 get함수를 잘못 사용하게 된다면
컴파일러조차 사전에 오류를 감지할 수 없으며,
이러한 오류를 없애기 위해서
simplearraylistforinteger이나
simplearraylistforstring같이
형식에 따라 전부 함수와 클래스를 만들어줘야하는 상황이 생긴다.
이는 코드의 복잡성과 중복성을 증가시키는 요소이므로
반드시 없애야 할 종류의 상황 중 하나이다.

이럴때, 제네릭(generic)이 사용된다.