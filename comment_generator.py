'''
This file is used to generate the comment table.
It will generate a csv file called 411_comment.csv.
'''
import csv
import random
res = []

for i in range(1,1500):
    user = random.randint(0, 9)
    rate = random.randint(1,5)
    text = ["Bad","Poor", "Fair", "Nice", "Perfect"]
    res.append([i, rate, text[rate - 1]])


with open('411_comment.csv', 'w', newline='') as csvfile:
    fieldnames = ['commentId', 'Text', 'Rate']
    writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

    writer.writeheader()
    for elem in res:
        writer.writerow({'commentId': elem[0], 'Text': elem[2], 'Rate':elem[1]})