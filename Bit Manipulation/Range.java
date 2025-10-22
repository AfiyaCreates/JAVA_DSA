//range of no 
// in 1 byte (8 bits ) = 256 no can be stored 
//8 bits ...each can store 0 or 1 ...2*2*...= 2^8=256 (total no of unique no that can be stored )
//since msb is reserved for sign the actual no is in 7 bits ....that gives 2^7 = 128 bits ....so can store 128 positive and 128 negative bits
//-128 to 128 bits ...but this gives 257 no including 0 ...so ...we have to remove a no fro positive side (not from -ve coz -ve of 0 is not actually -ve)..
//the range = -128 to 127


//formula to find range
//-2^(n-1) to 2^(n-1) -1