class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:

        n=len(digits)
        if (n==sum(digits)/9):
            extra=[0]*(n+1)
            extra[0]=1
            return extra
        
        for i in range(n-1,-1,-1):
            if digits[i]<9:
                digits[i]+=1
                return digits

            digits[i]=0
