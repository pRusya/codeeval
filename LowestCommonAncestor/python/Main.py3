class Node:
    def __init__(self, val):
        self.value = val
        self.leftChild = None
        self.rightChild = None

    def insert(self, data):
        if self.value == data:
            return False
        elif self.value > data:
            if self.leftChild:
                return self.leftChild.insert(data)
            else:
                self.leftChild = Node(data)
                return True
        else:
            if self.rightChild:
                return  self.rightChild.insert(data)
            else:
                self.rightChild = Node(data)
                return True

    def find(self, data):
        print('search in', self.value)
        if self.value == data:
            print('node value =', data)
            return True
        elif self.value > data:
            if self.leftChild:
                return self.leftChild.find(data)
            else:
                return False
        else:
            if self.rightChild:
                return self.rightChild.find(data)
            else:
                return False

    def preorder(self):
        if self:
            print(str(self.value))
            if self.leftChild:
                print('leftChild of', self.value, '=', end=' ')
                self.leftChild.preorder()
            if self.rightChild:
                print('rightChild of', self.value, '=', end=' ')
                self.rightChild.preorder()

    def path(self, data):
        if self.value == data:
            return [self.value]
        elif self.value > data:
            if self.leftChild:
                return [self.value] + self.leftChild.path(data)
            else:
                return [None]
        else:
            if self.rightChild:
                return [self.value] + self.rightChild.path(data)
            else:
                return [None]


class Tree:
    def __init__(self):
        self.root = None

    def insert(self, data):
        if self.root:
            return self.root.insert(data)
        else:
            self.root = Node(data)
            return True

    def find(self, data):
        if self.root:
            return self.root.find(data)
        else:
            return False

    def preorder(self):
        print("PreOrder")
        print('root =', end=' ')
        self.root.preorder()

    def path(self, data):
        return self.root.path(data)

bst = Tree()
for x in [30, 8, 52, 3, 20, 10, 29]:
    bst.insert(x)

import sys, re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        xy = re.split('\s', line.rstrip())
        xy = list(map(int, xy))
        pathx = bst.path(xy[0])
        pathy = bst.path(xy[1])
        ancestors = [x for x in pathx if x in pathy]
        print(ancestors[-1])
