#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Dec 28 19:54:02 2019

@author: dipak
"""

from collections import OrderedDict
foo = "collalation"
result = "".join(OrderedDict.fromkeys(foo))
print(result)