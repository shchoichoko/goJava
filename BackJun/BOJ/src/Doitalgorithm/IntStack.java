package Doitalgorithm;

public class IntStack {
	// 스택 예제
	private int max;	// 스택의 용량
	private int ptr;	// 스택의 포인터
	private int[] stk;	// 스택 본체
	
	//실행 시 예외 : 스택이 비어있을 경우
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외: 스택이 가득 찼을 경우
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];	//스택 본체용 배열을 생성
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// push 메서드
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	// pop 메서드
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	
	// peak 메서드 : 스택의 꼭대기에 있는 데이터를 보는 메서드
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	
	// 스택에서 x를 찾아서 인덱스를 반환함.(값이 없을 시 -1을 반환)
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i --) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// 스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택에서 쌓여 있는 데이터의 수를 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어있는지 확인.  비어있다면 true를 반환, 아니라면 false를 반환
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼는지 확인. 가득 찼다면 true를 반환, 아니라면 false를 반환.
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력.
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다!");
		} else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
				System.out.println();
			}
		}
		
	}
	
}
