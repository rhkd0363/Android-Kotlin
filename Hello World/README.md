### 안드로이드 스튜디오 설치

[AndroidStudio 설치 사이트](https://developer.android.com/studio)에서 PC에 맞게 다운로드 및 설치

### 프로젝트 생성

- 기본적으로 사용할 템플릿을 선택하고, 프로젝트명과 패키지명 사용언어(Kotlin)과 SDK 버전을 선택하여 프로젝트 생성

### 프로젝트 구조

- 기본적으로 프로젝트를 생성하면 app 폴더안에 java 폴더와 res 폴더 생성
- java 폴더에는 기능, res에는 인터페이스 관련 파일로 구분

### 에뮬레이터 설치

- AVD(Android Virtual Device) 설치 후 원하는 가상 장치를 선택하여 연결
- 사용하는 PC에 맞게 맞게 에뮬레이터 선택 후 구성 설치
- 기타 세부 설정( latency, 코어 수, RAM 크기 등)

### Hello World 출력

```java
MainActivity.kt
    // R 은 res 폴더를 가리킨다.
    setContentView(R.layout.activity_main)
```
