package _03_StackQueue;

import java.util.Stack;

class Money{
	private int value;

	public Money(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
public class T02_Stack {
	public static void main(String[] args) {
		Stack<Money> moneyStack = new Stack<Money>(); 

		moneyStack.push(new Money(1000));
		moneyStack.push(new Money(30));
		moneyStack.push(new Money(500));
		moneyStack.push(new Money(70));
		
		System.out.println("스택의 크기 : " + moneyStack.size());
		
		while(!moneyStack.isEmpty()) {
			Money money = moneyStack.pop();
			System.out.println("꺼내온 금액 : " + money.getValue() + "원");
		}
	}
}
