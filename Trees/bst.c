#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *left;
    struct Node *right;
};

struct Node *createNode(int data){
    struct Node *node = (struct Node *)malloc(sizeof(struct Node));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
}

struct Node *Insert(struct Node *root, int data){
  if(root == NULL){
    return createNode(data);
  }

  if(root->data > data){
    root->left = Insert(root->left, data);
  }
  else{
    root->right = Insert(root->right, data);
  }
  return root;
}

struct Node *Delete(struct Node *root, int val){
    if(root->data > val){
        root->left = Delete(root->left, val);
    }
    else if(root->data < val){
        root->right = Delete(root->right, val);
    }
    else{
        if(root->left == NULL && root->right == NULL){
            return NULL;
        }

        if(root->left == NULL){
            return root->right;
        }
        else if(root->right == NULL){
            return root->left;
        }

        struct Node *temp = inordersucessive(root->right);
        root->data = temp->data;
        root->right = Delete(root, temp->data);
    }
    return root;

}
struct Node *inordersucessive(struct Node *root){
    while(root->left != NULL){
        root = root->left;
    }
    return root;
}