##분석
#사용자가 게임 수 를 선택하고 게임 수 만큼 1-45까지 숫자 중 6개를 출력해줌

##설계
#1.랜덤모듈 가져오기
#2.게임 수 지정하기
#3.랜덤으로 1~45까지 리스트 불러오기
#4.리스트 안에서 겹치지않는 6개 숫자 선택하기
#5.게임 수 만큼 반복
#6.결과 출력

##구현

import random
i=list(range(30))

def lotoo_number():
    num=set()
    while len(num)<6:
        num.add(random.randint(1,45))
    num=list(num)
    num.sort()
    print(num)
      
'''
def lotoo_continue():
    while True:
        user = input('로또 추첨을 계속 하시겠습니까?\n Y or N')
        if user == 'Y':
            return True
        elif user == 'N':
            return False
        else :
            print('(대소문자 구분) Y 또는 N 을 정확히 입력해주세요')
'''
def lotoo_count():
    count=int(input('게임을 진행 할 횟수를 입력하세요 : '))
    for i in range(count):
        lotoo_number()
        


while True:    
    if lotoo_count():
        #if lotoo_continue():
            #continue
        #else :
            break





