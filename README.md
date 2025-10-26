# java-racingcar-precourse

## 구현 기능 목록

1. 자동차의 이름을 입력 받는 기능
2. 시도할 횟수를 입력 받는 기능
3. 자동차 이름의 유효성을 검사할 수 있는 기능 (5자 이하)
4. 0~9의 랜덤한 숫자를 생성하는 기능
5. 랜덤한 숫자가 4이상일 때 전진하는 기능
6. 라운드 마다 자동차의 이동결과를 출력하는 기능
7. 경기가 끝난 후 우승자의 이름을 출력하는 기능

## 클래스 구조

```console
📁 racingcar
│
├─ 📄 Application.java           → main 메서드, 전체 실행
├─ 📄 Car.java                   → 자동차 객체 (이름, 위치)
├─ 📄 CarGame.java               → 게임 전체 진행, 우승자 판별
├─ 📄 CarNameValidator.java      → 자동차 이름 유효성 검사
├─ 📄 InputView.java             → 입력 담당
├─ 📄 MoveStrategy.java          → 자동차 이동 전략 인터페이스
├─ 📄 OutputView.java            → 출력 담당
├─ 📄 RandomMoveStrategy.java    → 랜덤 이동 전략 구현
```