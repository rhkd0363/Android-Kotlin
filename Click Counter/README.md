## Click Counter

### 요소 추가

- layout 에서 요소(TextView, Button 등) 추가시 Constraints 추가 필요
  - Infer constraints를 통해 추가
- 추가한 요소의 ID를 설정

### 요소 접근 및 사용

- 요소의 ID에 findViewById<>() 로 접근

```kotlin
    val btnClickMe = findViewById<Button>(R.id.myButton)
    val myTextView = findViewById<TextView>(R.id.textView)
    var timesClicked = 0
```

### 요소에 이벤트 함수 설정

- 원하는 이벤트리스너 함수를 정해준다.

- 클릭이벤트 설정 시

```kotlin
    btnClickMe.setOnClickListener {
        timesClicked += 1

        myTextView.text = timesClicked.toString()
    }
```

### Toast

- Toast는 안내 메세지가 나오고 일정 시간이 지나면 사라지는 팝업 메세지
- 인자
  1. context
  2. 메세지 내용
  3. 노출 시간(Toast.LENGTH_SHORT or Toast.LENGTH_LONG)

```kotlin
    Toast.makeText(this,"This is Toast!", Toast.LENGTH_LONG).show()
```
