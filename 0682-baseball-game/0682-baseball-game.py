class Solution:
    def calPoints(self, operations: List[str]) -> int:

        L = []
        for i in operations:
            if(i == "D"):
                L.append(L[-1]*2)
            elif(i=="C"):
                L.pop()
            elif(i=="+"):
                L.append(L[-1]+ L[-2])
            else:
                L.append(int(i))
        return sum(L)
        