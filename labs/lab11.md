# [CSE2016] 2023년도 가을학기 프로그램설계방법론
## 한양대학교 ERICA 소프트웨어융합대학 인공지능학과

### 실습 : 슬라이드 퍼즐 게임 확장하기

- 지난 시간에 구현했던 GUI 버전의 퍼즐 게임을 다음과 같이 확장해 봅시다.

* 애플리케이션을 실행하면 다음과 같은 퍼즐 보드 창을 띄웁니다. `Start` 버튼 옆에 시간을 측정하는 라벨을 추가합니다.

<img src="image11/timer0.png" width="300">

* `Start` 버튼을 누르면 다음과 같이 우하단 구석에 있는 한칸을 비운 채로 퍼즐 조각을 무작위로 섞은 퍼즐보드가 생기며 퍼즐 게임을 시작합니다. 버튼을 누를 때마다 시간도 다시 처음부터 측정합니다.

<img src="image11/timer2.png" width="300">

* 퍼즐 조각을 움직여 퍼즐 보드를 처음과 똑같이 만들면 게임이 끝납니다.

<img src="image11/timer_end.png" width="300">

* Start 버튼 옆에 시간을 측정하는 라벨을 추가합니다.
* 퍼즐 보드의 재배치를 완료하면 다음과 같이 우하단 빈 칸에 `Done` 이라고 표시하면서 게임이 끝납니다.

<img src="image11/timer4.png" width="300">

* 게임이 끝나면 어떤 버튼을 누르더라도 퍼즐 조각이 움직이지 않아야 합니다.
* 게임이 끝나면 메시지 창으로 걸린 시간을 출력해줍니다.
* 언제든지 `Start` 버튼을 누르면 다시 처음부터 퍼즐 게임을 할 수 있어야 합니다.