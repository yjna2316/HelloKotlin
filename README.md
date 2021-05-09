# Kotlin Study 저장소

빅 너드 랜치의 코틀린 프로그래밍

# Index
* chap1 - Project Setting & Github Repository 생성
* [chap2 - 변수, 상수, 타입](#chap2-변수-상수-타입)
    * 변수 & 상수 선언
    * 타입추론(type inference)
    * 컴파일 시점 상수
    * 코틀린 바이트코드 살펴보기
    * 코틀린은 참조 타입만 제공한다

---
## Day1

### chap1 Project Setting & Github Repository 생성
코틀린 프로그램은 JVM에서 자바 바이트코드로 실행된다.

##

### chap2 변수, 상수, 타입
* **TypeIntro.kt**

* 코틀린은 **컴파일 시점**에 변수 타입 체크를 하는 **정적 타입 언어**

#### 변수 & 상수 선언

- 변수: var
    - variable
    - mutable 변수
     ~~~
       var playerScore: Int = 5
     ~~~

- 상수: val
    - value 의미
    - read-only 변수
     ~~~
       val playerName: String = "에스트라곤"
     ~~~
    - 12장 참조. val 변수가 다른 값 반환하는 특별한 경우가 있기 때문에 진정한 상수는 아니다.
    - 컴파일 시점 상수가 찐 상수

#### 타입추론(type-inference)
변수 생성시 변수 타입을 생략하더라도 변수 생성을 하게 해주는 코틀린 기능이다.
코틀린 컴파일러가 타입을 추론해서 추가해주기 때문에 컴파일된 바이트 코드에서는 타입이 명시되어 있다.
   ~~~
     val playerName = "에스트라곤"
   ~~~
#### 컴파일 시점 상수
* 진짜 real 상수. 초기값을 절대 변경하지 않는 변수. **const val**
  ~~~
  const val MAX_EXPERIENCE: Int = 5000
  ~~~
* 선언 위치
    * main 함수를 포함해서 모든 함수 외부에 정의되어야 한다.
    * 컴파일 시점에 값이 지정되어야 하기 때문
    * main외 다른 함수 그리고 함수 내부에 선언된 변수들은 모두 runtime 시점에(프로그램이 실행되는 동안) 생성된다.

#### 코틀린 바이트코드 살펴보기
* Show Kotlin Bytecode
* 코틀린 코드가 JVM에서 어떻게 동작하는지 분석방법의 일환 part 1

#### 코틀린은 참조 타입만 제공한다
* 자바에는 참조(reference) 타입과 기본(primitive) 타입 두 종류가 있고
* 코틀린은 참조타입만 제공한다.
* 하지만, 성능상 primitive 타입이 더 좋기 때문에 코틀린(코틀린 컴파일러)은 내부적으로 primitive 타입을 사용해 컴파일한다.