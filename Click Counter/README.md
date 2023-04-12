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
