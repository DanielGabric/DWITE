#include <stdio.h>

int main()
{
    int i,N;
    for(i=0;i<5;++i)
    {
        scanf("%d",&N);
        char a1,a2,a3,a4;
        int m,k;
        for(a1='A';a1<='Z';++a1)
        {
            for(a2='A';a2<='Z';++a2)
            {
                for(a3='A';a3<='Z';++a3)
                {
                    for(a4='A';a4<='Z';++a4)
                    {
                        k = a1*1000000+a2*10000+a3*100+a4;
                        m = a1*11+a2*101+a3*1009+a4*10007;
                        if(k%m==N)
                        {
                            printf("%c%c%c%c\n",a1,a2,a3,a4);
                            goto out;
                        }
                    }
                }
            }
        }
        out:
        a1=a2=a3=a4='A';
    }
    return 0;
}