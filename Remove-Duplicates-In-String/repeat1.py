#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Dec 28 19:19:49 2019

@author: dipak
"""

s1 = "parallel"
s2 = list()
s3 = " "
n = len(s1)
for i in s1:
    count = 1
    for j in s2:
        if(i==j):
            count+=1
    if(count<2):
        s2.append(i)
s4 = s3.join(s2)
print("".join(s4.split()))
    