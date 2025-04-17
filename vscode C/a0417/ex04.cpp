#include <stdio.h>

struct Student {
    char name[20];
    int studentid;
    char grade;
};

int main() {
    struct Student s;
    printf("이름 입력: ");
    scanf("%s", s.name);

    printf("학번: ");
    scanf("%d", &s.studentid);

    printf("학점: ");
    scanf(" %c", &s.grade);

    printf("\n학생 정보\n이름: %s, 학번: %d, 학점: %c\n", s.name, s.studentid, s.grade);
    return 0;
}