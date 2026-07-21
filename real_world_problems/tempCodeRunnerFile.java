double av=(a[n-1]+a[n-2])/2.0;
                 for(int k=0;k<n;k++){

                    if(a[k]>=av)
                        s+=a[k];
                }
                if(s<min)
                    min=s;