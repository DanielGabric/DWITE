for msdfsadm in range(5):
    s = raw_input()
    m = False
    for i in range(len(s)-1,0,-1):
        if s[0:i] == s[len(s)-i:len(s)]:
            print s+s[i:len(s)]
            m = True
            break
    if not m:
        print s + s