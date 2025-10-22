//negative of binary no ....negative of a no in binary form 
//1 byte = 8 bits 
//starting bit is called msb and last bit lsb 
//msb - tells us no is positive or neagtive ...it is a reserved bit....so in 8 bits 1 bit represents sign and rest 7 represents value
//if msb =1 - negative ....msb=0-positive
// to get negative of a no take its 2 complement - take 1 complemnet and add 1 to it 

// eg - to store 10 in 1 byte = 00001010(binary)
//1 complement - 11110101 
//add 1 = 11110101 + 1 = 11110110 = -10
//why this method gives - of a no ? - 
//1010110111 - to store in 1 byte(8 bits)...starting bits 10 gets discareded and rest get stored 
//and we know subtracting no from 0 give negative of a no ...00000000-00001010 = -ve of no ....we can add 1 to the starting of 0s wont make diffrence since it gets discarded 
//100000000-00001010 
//100000000 can be written as 11111111 + 1 ...
// 11111111 + 1 - 00001010.....11111111-00001010 + 1.....here 11111111-00001010 is complement of a no ...and we are adding 1 to it ....which is giving complement of the no 