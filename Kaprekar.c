#include <stdio.h>

int main() {
    long long n;
    printf("Enter a non-negative integer: ");
    if (scanf("%lld", &n) != 1 || n < 0) {
        printf("Invalid input.\n");
        return 1;
    }

    if (n == 0 || n == 1) {
        printf("%lld is a Kaprekar Number.\n", n);
        return 0;
    }

    long long sq = n * n;

    // count digits of n (not of the square)
    long long temp = n;
    int d = 0;
    while (temp > 0) {
        d++;
        temp /= 10;
    }

    // compute 10^d using integer arithmetic
    long long divisor = 1;
    for (int i = 0; i < d; i++)
        divisor *= 10;

    long long left = sq / divisor;
    long long right = sq % divisor;

    if ((left + right) == n)
        printf("%lld is a Kaprekar Number.\n", n);
    else
        printf("%lld is NOT a Kaprekar Number.\n", n);

    return 0;
}
