#include<stdio.h>
#include<stdlib.h>

struct Node {
    int val;
    struct Node *next;
};

struct Node *head = NULL;
struct Node *tail = NULL;

void reverse(struct Node *block) {
    struct Node *pre = NULL;
    struct Node *curr = block;
    struct Node *nex = NULL;
    
    while (curr != NULL) {
        nex = curr->next;
        curr->next = pre;
        pre = curr;
        curr = nex;
    }
    head = pre; // Update the head to the new first node
}

int main() {
    struct Node *h1 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *h2 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *h3 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *h4 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *h5 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *h6 = (struct Node *)malloc(sizeof(struct Node));
    
    h1->val = 1;
    h2->val = 2;
    h3->val = 3;
    h4->val = 4;
    h5->val = 5;
    h6->val = 6;
    
    head = h1;
    h1->next = h2;
    h2->next = h3;
    h3->next = h4;
    h4->next = h5;
    h5->next = h6;
    h6->next = NULL;
    printf("Before reverseing\n");

    struct Node *temp = head;
    while (temp != NULL) {
        printf("%d->", temp->val);
        temp = temp->next;
    }
    printf("NULL\n");
    reverse(h1);
    printf("After reverseing\n");
    temp = head;
    while (temp != NULL) {
        printf("%d->", temp->val);
        temp = temp->next;
    }
    printf("NULL\n");

    return 0;
}
