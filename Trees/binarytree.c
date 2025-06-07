#include<stdio.h>
#include<stdlib.h>

#define MAX 100

typedef struct Node{
int data;
struct Node *left, *right;
}Tree;

struct stack{
    int top;
    struct Node *Item[MAX];
};

struct stack *createstack(){
    struct stack *s = (struct stack *)malloc(sizeof(struct stack));
    s->top = -1;
}

int isEmpty(struct stack *s){
    return s->top == -1;
}

int isFull(struct stack *s){
    return s->top == MAX-1;
}

void push(struct stack *s, struct Node *node){
    if(isFull(s)){
        printf("StackoverFlow");
        return;
    }
    s->Item[++s->top] = node;

}

struct Node *pop(struct stack *s){
    if(isEmpty(s)){
        return NULL;
    }
    struct Node *node = s->Item[s->top--];
    return node;
}

struct Node *peek(struct stack *s){
    if(isEmpty(s)){
        return NULL;
    }
    struct Node *node = s->Item[s->top];
    return node;
}

Tree *createANode(int data){
    Tree *node = (Tree *)malloc(sizeof(Tree));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
}

Tree *binarytree(Tree *root, int val){
    if(root == NULL){
        return createANode(val);
    }
    if(root->data > val){
        root->left = binarytree(root->left, val);
    }
    else{
        root->right = binarytree(root->right, val);
    }
    return root;
}

void display(Tree *root){
   if(root == NULL){
    return;
   }
   display(root->left);
   printf("%d ", root->data);
   display(root->right);
}

void inorderorderTraverse(struct Node *root){
    struct stack *s= createstack();
    struct Node *current = root;
    while(current != NULL || !isEmpty(s)){
        while(current != NULL){
            push(s, current);
            current = current->left;
        }
        current = pop(s);
        printf("%d ", current->data);
        current = current->right;
    }
}

void preorderTraverse(struct Node *root){
    if(root == NULL){
        return;
    }
    struct stack *s = createstack();
    push(s, root);
    while(!isEmpty(s)){
        struct Node *current = pop(s);
        printf("%d ", current->data);

        if(current->right){
            push(s, current->right);
        }
        if(current->left){
            push(s, current->left);
        }
    }
}

void postorderTraverse(struct Node *root){
    struct stack *s1 = createstack();
    struct stack *s2 = createstack();
    push(s1, root);
    while(!isEmpty(s1)){
        struct Node *current = pop(s1);
        push(s2, current);

        if(current->left){
            push(s1, current->left);
        }
        if(current->right){
            push(s1, current->right);
        }
    }
    while(!isEmpty(s2)){
        struct Node *current = pop(s2);
        printf("%d ", current->data);
    }

}

int main(){
    int arr[] = {5, 7, 9, 4, 6, 3, 2};
    Tree *root = NULL;
    for(int i=0;i<7;i++){
       root = binarytree(root, arr[i]);
    }
    // display(root);
    inorderorderTraverse(root);
    printf("\n");
    preorderTraverse(root);
    printf("\n");
    postorderTraverse(root);

    return 0;
}