import json

with open('/Users/clara/NPS/json/merged.json', 'r') as myfile:
    data = myfile.read()
obj = json.loads(data)

##with open('/Users/clara/NPS/json/visitorcenters.json', 'r') as myfile:
##    data2 = myfile.read()
##obj2= json.loads(data2)
##
##parkcode = []
##for i in range(len(obj1['data'])):
##    parkcode.append(obj1['data'][i]['parkCode'])

parkcode = []
for i in range(len(obj)):
    parkcode.append(obj[i]['parkCode'])
print(len(parkcode))
