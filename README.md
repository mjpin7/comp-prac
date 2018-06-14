# comp-prac

## Contents
* [Problem A](#a)
* [Problem B](#b)
* [Problem C](#c)

### <a name="a"></a>Problem A
    1. Read the number N to encrypt : M = 265
    2. Interpret N as a decimal number : X1 = 265 (decimal)
    3. Convert the decimal interpretation of N to its binary representation : X1 = 100001001 (binary)
    4. Let b1 be equal to the number of 1’s in this binary representation : b1 = 3
    5. Interpret N as a Hexadecimal number : X2 = 265 (hexadecimal)
    6. Convert the hexadecimal interpretation of N to its binary representation : X2 = 1001100101
    7. Let b2 be equal to the number of 1’s in the last binary representation : b2 = 5
    8. The encryption is the result of M xor (b1 ∗ b2) : 265 xor (3*5) = 262

###### Input
    The first line will contain a number N which is the number of cases that you have to process. Each
    of the following N Lines (0 < N ≤ 1000) will contain the number M (0 < M ≤ 9999, in decimal
    representation) which is the number the student wants to encrypt.

###### Output
    You will have to output N lines, each containing the number b1 and b2 in that order, separated by one
    space corresponding to that lines number to crypt

###### Example

| Input | Output |
|-------|--------|
| 3     | 3 5    |
| 265   | 6 3    |
| 111   | 5 5    |
| 1234  |        |

### <a name="b"></a>Problem B
    You and your team use surveying equipment to calculate the slope and distance (along the trail) of
    each section of the trail. For example, a trail may begin completely flat for 500 meters, then switch
    to an 8 incline for 1000 meters, and then switch to a 2 decline for the final 500 meters. With so
    many new trails opening, manually calculating the elevation difference from the section descriptions
    has become too tedious. So, you’ve decided to write a program to make the process easier.

###### Input
    Input begins with a positive integer n  100 indicating the number of trail sections. The following
    n lines describe the trail sections from the beginning to the end of the trail. Each trail section is
    described by two integers a d (50 ≤ a ≤ 50, 1 ≤ d ≤ 10000) indicating its angle of elevation in
    degrees and the distance in meters along that section of the trail, respectively.

###### Output
    Display the difference in elevation between the start of the trail and the end of the trail in meters.
    The difference in elevation will always be greater than 0 meters. Round answers to the hundredths
    place. Always print answers to two decimal places and include the leading 0 on answers between 0
    and 1.

###### Example

| Input1 | Output1 |
|--------|---------|
| 3      | 121.72  |
| 0 500  |         |
| 8 1000 |         |
| -2 500 |         |

| Input2  | Output2 |
|---------|---------|
| 3       | 0.73    |
| 12 1000 |         |
| -11 1200|         |
| 5 250   |         |

| Input3  | Output3 |
|---------|---------|
| 2       | 382.00  |
| -7 2000 |         |
| 9 4000  |         |


### <a name="c"></a>Problem C
  