class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        tempstack =[]
        
        for i,price in enumerate(prices):
            while tempstack and prices[tempstack[-1]]>=price:
                index= tempstack.pop()
                prices[index] -=price
            tempstack.append(i)
        return prices
        