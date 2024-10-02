'''
This file is used to generate the dish table. It requires to have 411_restaurant - 411_restaurant.csv under its root
folder. It will generate a csv file called 411_dish.csv.

Currently this generator only contains 17 dishes, we might add more as the project goes.
'''
import csv
import random
res = []
with open('411_restaurant - 411_restaurant.csv', newline='') as csvfile:
    spamreader = csv.reader(csvfile, delimiter=' ', quotechar='|')
    c = 0
    for row in spamreader:
        curr = ''.join(row)
        res.append([curr.split(',')[0]])

menu = [  ('classic chicken sandwich', 9.99),
            ('10 traditional wings', 12.99),
            ('beef fire rice', 9.99),
            ('pho beef noodle', 9.99),
            ('miso soup ramen', 9.99),
            ('8os Rib eye', 25.99),
            ('half baby rib', 21.99),
            ('roast duck', 21.99),
            ('Regular Fries', 6.99),
            ('Eel Nigiri/Sashimi', 4),
            ('Fatty Salmon Nigiri/Sashimi', 3),
            ('Octopus Nigiri/Sashimi', 3.5),
            ('Sake Don', 20),
            ('Don Katsu', 15),
            ('Chicken W. Fish Belly Hot Pot', 99.99),
            ('Boiled Corydoras In Spicy Szechuan Sauce', 22.99),
            ('Braised Dried Tofu W. Ham', 14.99),
          ]

dishes = []
for i in range(1, len(res)):
    prob = random.randint(0, 2)
    if prob == 2:
        continue
    a = random.randint(0, len(menu) - 1)
    b = random.randint(0, len(menu) - 1)
    while b == a:
        b = random.randint(0, len(menu) - 1)
    dishes.append([res[i][0], menu[a][0], menu[a][1]])
    dishes.append([res[i][0], menu[b][0], menu[b][1]])
print(len(dishes))
print(dishes[0])


with open('411_dish.csv', 'w', newline='') as csvfile:
    fieldnames = ['restaurant', 'dish', 'price']
    writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

    writer.writeheader()
    for elem in dishes:
        writer.writerow({'restaurant': elem[0], 'dish': elem[1], 'price':elem[2]})