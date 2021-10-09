#컴퓨터와 사용자의 가위바위보 프로그램 만들기

#분석
'''
1.사용자가 가위,바위,보를 입력한다.

2.컴퓨터가 랜덤으로 가위,바위,보 중 하나의 값을 가진다.

3.사용자와 컴퓨터간의 가위바위보 게임 승패를 판단한다.

4.게임 종료.
'''
#설계
'''
0.python의 random모듈을 불러온다.

1.user의 가위,바위,보 값을 입력받는다.
-if user의 입력값이 가위,바위,보 :
-else print('다시입력하세요')

2.com은 3개의 정수값을 랜덤으로 가진다.

3.com가 가진 3개의 정수 값을 가위,바위,보 로 변환시킨다.

4.user와 com의 승패를 판단한다.
-if user == com:
    print('비겼습니다.')
-elif user=='가위' and com =='보':
    print('이겼습니다.')
-elif user=='바위' and com =='가위':
    print('이겼습니다.')
-elif user=='보' and com =='바위':
    print('이겼습니다.')
-else :
    print('졌습니다.')

'''
#구현
'''
import random

inp= ['가위','바위','보']
vs={0:'비겼습니다.',1:'이겼습니다.',2:'졌습니다.'}

user = input('가위,바위,보 중 1개를 입력하세요 : ')

if not user in inp:
    print('정확히 입력해주세요')


com = inp[random.randint(0,2)]
print('사용자: '+user+' vs com: '+com+'')

if user == com:
    x=0
elif user == '가위' and com == '보':
    x=1
elif user == '바위' and com == '가위':
    x=1
elif user == '보' and com == '바위':
    x=1
else :
    x=2

print(vs[x])
    
'''

#함수를 활용해서 구현
import random

i = ['가위','바위','보']
s = {0:'졌네용ㅋㅋ',1:'오 이겼네용!!',2:'비겼네용'}

def CHECKWIN(user,com) : 
    if not user in i :
        print('똑바로 입력 안하냐?')
        return False

    print('YOU! ('+user+') vs ('+com+') COM!')

    if user == com :
        z=2
    elif user == '가위' and com == '보' :
        z=1
    elif user == '바위' and com == '가위' :
        z=1
    elif user == '보' and com == '바위' :
        z=1
    else :
        z=0
    
    print(s[z])
    return True

def CONTINUEGAME():
    while True:
        user = input('계속하려면 [ y ] 끝내려면 [ n ]을 입력하세요 :')
        if user == 'y':
            return True
        elif user == 'n':
            return False
        else :
            print('[y] or [n]을 입력하세요.')
        

print("------------------@ 게임시작 @------------------")

while True:
    user = input('안내면 진다! 가위 바위 보 : ')
    com=i[random.randint(0,2)]
    if CHECKWIN(user,com):
        if CONTINUEGAME():
            continue
        else :
            break
print("------------------@ 게임종료 @------------------")
        